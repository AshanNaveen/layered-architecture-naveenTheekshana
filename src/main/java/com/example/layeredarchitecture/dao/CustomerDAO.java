package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface CustomerDAO {
        public List<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

        public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

        public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

        public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;

        public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

        public String generateNextId() throws SQLException, ClassNotFoundException ;
        CustomerDTO getCustomerDetail(String id) throws SQLException, ClassNotFoundException;

}