package Service;

import DTO.UserDTO;

public class UserManagement {

    public Long register(UserDTO userDTO) {
        if (userDTO == null || userDTO.getUserName() == null) {
            throw new RuntimeException("UserName can not be null !");
        }
        //check unique by identifyType and identifyNumber
        UserDTO exist = new UserDTO();
        if (exist.getIdentifyNumber().equals(userDTO.getIdentifyNumber())
                && exist.getIdentifyType() == exist.getIdentifyType()) {
            throw new RuntimeException("User already exist !");
        }

        //save date into database,mock user id
        return 1234567L;
    }

    public UserDTO query(Long userId){
        //check if data exist
        //use mock data
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(123L);
        userDTO.setIdentifyNumber(1234L);
        userDTO.setIdentifyType(1);
        userDTO.setUserName("小白");
        return userDTO;
    }

}
