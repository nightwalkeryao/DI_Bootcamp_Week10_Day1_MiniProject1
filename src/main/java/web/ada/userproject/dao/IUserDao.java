package web.ada.userproject.dao;

import web.ada.userproject.exception.UserNotFoundException;
import web.ada.userproject.models.Users;

import java.util.List;

public interface IUserDao {
    /**
     * Find all users in the
     *
     * @return All the users list
     */
    public List<Users> findAll();

    /**
     * Find the user by ID passed in param
     * @param id
     * @return the user who has this ID
     */
    public Users findById(int id) throws UserNotFoundException;

    /**
     * Save the user in the database
     *
     * @param users
     */
    public Users create(Users users);
}
