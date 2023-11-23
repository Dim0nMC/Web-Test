package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserList {

    private static UserList instance = new UserList();

    private List<User> userlist;

    public static UserList getInstance() {
        return instance;
    }

    private UserList() {
        userlist = new ArrayList<>();
    }

    public void add(User user) {
        userlist.add(user);
    }

    public List<String> list() {
        return userlist.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }


}
