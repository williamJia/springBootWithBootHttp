package com.coocaa.neo_client.dao;

import com.coocaa.neo_client.model.Tag;

public interface TagDao {
    public Tag getByName(String name);
}
