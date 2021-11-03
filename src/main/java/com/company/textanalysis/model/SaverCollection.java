package com.company.textanalysis.model;

import com.company.textanalysis.dto.CollectionDTO;
import com.company.textanalysis.ui.SavingList;

import java.util.ArrayList;
import java.util.List;

public class SaverCollection implements SavingList {

    @Override
    public List<String> saveList(int vowelsNumber, int consonantsNumber, String vowels, String consonants) {
        CollectionDTO collectionDTO = new CollectionDTO(vowelsNumber, consonantsNumber, vowels, consonants);
        List<String> listDTO = new ArrayList<String>();
        listDTO.add(Integer.toString(collectionDTO.getVowelsNumber()));
        listDTO.add(collectionDTO.getVowels());
        listDTO.add(Integer.toString(collectionDTO.getConsonantsNumber()));
        listDTO.add(collectionDTO.getConsonants());
        return listDTO;
    }
}
