package io.swagger.api;

import io.swagger.model.User;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-19T21:20:04.601Z")

@Api(value = "friends", description = "the friends API")
public interface FriendsApi {

    @ApiOperation(value = "accepts a friend request", notes = "Accepts a friend request ", response = Void.class, tags={ "friends", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "friend request accepted", response = Void.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Void.class) })
    @RequestMapping(value = "/friends/accept",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> friendsAccept(@ApiParam(value = "User's token", required = true) @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "The user's id who is accepting the request", required = true) @RequestParam(value = "userId", required = true) String userId,
        @ApiParam(value = "The friend's username who made the request", required = true) @RequestParam(value = "friendUsername", required = true) String friendUsername);


    @ApiOperation(value = "returns a list of friends", notes = "Returns a list of friends ", response = User.class, responseContainer = "List", tags={ "friends", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "friend request accepted", response = User.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = User.class) })
    @RequestMapping(value = "/friends/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> friendsList(@ApiParam(value = "User's token", required = true) @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "The user's id to retrieve friend list for", required = true) @RequestParam(value = "userId", required = true) String userId);


    @ApiOperation(value = "creates a friend request", notes = "Creates a friend request ", response = Void.class, tags={ "friends", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Friend Request created successfully", response = Void.class),
        @ApiResponse(code = 400, message = "Bad input parameter", response = Void.class) })
    @RequestMapping(value = "/friends/request",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> friendsRequest(@ApiParam(value = "User's token", required = true) @RequestParam(value = "token", required = true) String token,
        @ApiParam(value = "The id of user who is making the request", required = true) @RequestParam(value = "userId", required = true) String userId,
        @ApiParam(value = "The username to add as a friend", required = true) @RequestParam(value = "friendUsername", required = true) String friendUsername);

}
