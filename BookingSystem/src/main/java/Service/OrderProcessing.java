package Service;

import DTO.OrderDTO;

public class OrderProcessing {

    public Long create(OrderDTO orderDTO){
        //save orderDTO into database,return mock id
        return 1234567L;
    }

    public boolean cancel(Long orderId){
        //cancel by orderId, update status to cancel status;
        return true;
    }

    public int queryStatus(Long orderId){
        //query database by orderId,and return order status
        return 1;
    }
}
