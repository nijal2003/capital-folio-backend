package com.example.capital_folio_backend.service;

import com.example.capital_folio_backend.dto.FieldResponse;
import com.example.capital_folio_backend.dto.SchemaResponse;
import com.example.capital_folio_backend.model.Calculator;
import com.example.capital_folio_backend.model.CalculatorField;
import com.example.capital_folio_backend.repository.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class CalculatorServiceImpl implements CalculatorService {
    @Autowired
    private CalculatorRepository calculatorRepository;

    @Override
    public List<Calculator> getAllCalculators() {
        return calculatorRepository.findAll();
    }

    @Override
    public Optional<Calculator> getCalculatorById(UUID id) {
        return calculatorRepository.findById(id);
    }

    @Override
    public Calculator saveCalculator(Calculator calculator) {
        return calculatorRepository.save(calculator);
    }

    @Override
    public void deleteCalculator(UUID id) {
        calculatorRepository.deleteById(id);
    }

    @Override
    public SchemaResponse getSchema(String type){

        Calculator calculator=calculatorRepository.findByCategory(type.toLowerCase());

        List<CalculatorField> feilds=calculator.getFields();

        List<FieldResponse> fieldResponses=mapToFieldResponse(feilds);

        SchemaResponse schemaResponse=new SchemaResponse();
        schemaResponse.setFields(fieldResponses);
        schemaResponse.setType(type);
        schemaResponse.setTitle(calculator.getTitle());

        return schemaResponse;

    }

    private List<FieldResponse> mapToFieldResponse(List<CalculatorField> feilds){
        List<FieldResponse> response=new ArrayList<>();

        for(CalculatorField feild:feilds){
            FieldResponse fieldResponse=new FieldResponse();
            fieldResponse.setKey(feild.getKey());
            fieldResponse.setLabel(feild.getLabel());
            fieldResponse.setRequired(feild.getRequired());
            fieldResponse.setType(feild.getType());
            response.add(fieldResponse);
        }
        return response;
    }


}