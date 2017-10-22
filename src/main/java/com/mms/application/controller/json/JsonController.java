package com.mms.application.controller.json;


import com.mms.application.bean.Profile;
import com.mms.application.bean.User;
import com.mms.application.dao.ProfileDao;
import com.mms.application.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="json")
public class JsonController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ProfileDao profileDao;

    @GetMapping(path="/user") // Map ONLY GET Requests
    public @ResponseBody
    String getUserName (@RequestParam String username) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        return profileDao.findByUsername(username).getFirstname();
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Profile> getAllProfiles() {
        // This returns a JSON or XML with the users
        return profileDao.findAll();
    }
}
