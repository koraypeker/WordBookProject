package com.tr.wordbook.dao;

import com.tr.wordbook.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

/**
* Created by K.PEKER on 10/7/2017.
*/
public interface BaseDaoM extends
        JpaRepository <Word, Long> {

}
