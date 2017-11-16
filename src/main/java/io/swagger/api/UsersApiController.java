package io.swagger.api;

import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-19T21:20:04.601Z")

@Controller
public class UsersApiController implements UsersApi {

    public ResponseEntity<InlineResponse200> usersCreate(@ApiParam(value = "The new user's first name", required = true) @RequestParam(value = "firstName", required = true) String firstName,
        @ApiParam(value = "The new user's last name", required = true) @RequestParam(value = "lastName", required = true) String lastName,
        @ApiParam(value = "The new user's username", required = true) @RequestParam(value = "username", required = true) String username,
        @ApiParam(value = "The new user's password", required = true) @RequestParam(value = "password", required = true) String password) {
        // do some magic!
        return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
    }

}
