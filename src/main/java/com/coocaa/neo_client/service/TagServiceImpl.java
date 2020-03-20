package com.coocaa.neo_client.service;

import com.coocaa.neo_client.dao.TagDaoImpl;
import com.coocaa.neo_client.model.Tag;
//import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDaoImpl tagDao;

    @Override
    public Tag getByName(String name) {
//        tagDao.getByName(name);
//        Tag tag = new Tag();
//        tag.setName(name);
        return tagDao.getByName(name);
    }
}
