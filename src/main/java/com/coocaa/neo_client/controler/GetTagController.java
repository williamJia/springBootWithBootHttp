package com.coocaa.neo_client.controler;

import com.coocaa.neo_client.model.Tag;
import com.coocaa.neo_client.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("tag/")
@ResponseBody
public class GetTagController {

    @Autowired
    TagService tagService;

    @GetMapping("getTagByName")
    public Tag getTagByName(HttpServletRequest request){
        Tag tag = tagService.getByName(request.getParameter("name"));//.toString();
        return tag;
    }
}
