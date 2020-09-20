package com.wojciech.concatenator.repository;

import com.wojciech.concatenator.source.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegerRepository implements DataRepository {
    private final List<DataSource<Integer>> dataSources;

    @Autowired
    public IntegerRepository(List<DataSource<Integer>> dataSources) {
        this.dataSources = dataSources;
    }

    @Override
    public Object[] getValuesFromEachSource() {
        Integer[] values = new Integer[dataSources.size()];

        for (int i = 0; i < values.length; i++) {
            values[i] = dataSources.get(i).getValue();
        }

        return values;
    }
}
