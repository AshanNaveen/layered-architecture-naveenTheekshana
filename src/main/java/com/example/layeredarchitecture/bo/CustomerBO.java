package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomDTO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

/**
 * @author nvn
 * @created 12/23/2023 - 9:28 AM
 */
public interface CustomerBO {
    List<CustomerDTO> getAll() throws SQLException, ClassNotFoundException;

    boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException ;

    boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    boolean delete(String id) throws SQLException, ClassNotFoundException;

    boolean exist(String id) throws SQLException, ClassNotFoundException ;

    String generateNextId() throws SQLException, ClassNotFoundException ;
    CustomerDTO getDetail(String id) throws SQLException, ClassNotFoundException;
}
