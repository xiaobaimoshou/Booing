package DTO;

public class UserDTO {

    private Long userId;

    private String userName;

    private Long identifyNumber;

    private int identifyType;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(Long identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public int getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(int identifyType) {
        this.identifyType = identifyType;
    }
}
