package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * @author nvn
 * @created 12/23/2023 - 10:09 AM
 */
public interface PlaceOrderBO {
    boolean saveOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException;
    ItemDTO findItem(String code);
    String generateNextId() throws SQLException, ClassNotFoundException;

    List<ItemDTO> getAllItemCodes() throws SQLException, ClassNotFoundException;

    List<CustomerDTO> getAllCustomerIds() throws SQLException, ClassNotFoundException;

    boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

    boolean existItem(String code) throws SQLException, ClassNotFoundException;
}
