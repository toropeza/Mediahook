package io.swagger.api;

import io.swagger.model.User;

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
public class FriendsApiController implements FriendsApi {

    public ResponseEntity<Void> friendsAccept(@ApiParam(value = "User's token", required = true) @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "The user's id who is accepting the request", required = true) @RequestParam(value = "userId", required = true) String userId,
        @ApiParam(value = "The friend's username who made the request", required = true) @RequestParam(value = "friendUsername", required = true) String friendUsername) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<User>> friendsList(@ApiParam(value = "User's token", required = true) @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "The user's id to retrieve friend list for", required = true) @RequestParam(value = "userId", required = true) String userId) {
        // do some magic!
        return new ResponseEntity<List<User>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> friendsRequest(@ApiParam(value = "User's token", required = true) @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "The id of user who is making the request", required = true) @RequestParam(value = "userId", required = true) String userId,
        @ApiParam(value = "The username to add as a friend", required = true) @RequestParam(value = "friendUsername", required = true) String friendUsername) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
