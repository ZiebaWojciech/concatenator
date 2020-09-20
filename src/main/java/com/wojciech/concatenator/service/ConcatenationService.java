package com.wojciech.concatenator.service;

import com.wojciech.concatenator.dto.ConcatenationResult;

public interface ConcatenationService {
    ConcatenationResult concatenate(Object[] values);
}
