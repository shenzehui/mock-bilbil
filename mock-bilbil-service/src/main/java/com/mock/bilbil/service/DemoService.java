package com.mock.bilbil.service;

import com.mock.bilbil.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by szh on 2023-06-11
 *
 * @author szh
 */

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public String getNameById(Integer id) {
        return demoMapper.getNameById(id);
    }
}
