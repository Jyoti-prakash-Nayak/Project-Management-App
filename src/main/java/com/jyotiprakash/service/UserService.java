package com.jyotiprakash.service;

import com.jyotiprakash.modal.User;

public interface UserService {
    public User findUserProfileByJwt(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;

    public User findUserById(Long userId) throws Exception;

    public User updateUsersProjectSize(User user,int number);

//	public List<User> findAllUsers();

//	public List<User> getPenddingRestaurantOwner();

 //   void updatePassword(User user, String newPassword);

 //   void sendPasswordResetEmail(User user);

//	void sendPasswordResetEmail(User user);
}
