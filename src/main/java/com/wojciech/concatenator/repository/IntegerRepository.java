package com.wojciech.concatenator.repository;

import org.springframework.stereotype.Service;

@Service
public class IntegerRepository implements DataRepository {
    @Override
    public Object[] getValues() {
        return new Object[0];
    }
}
