package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.List;

/**
 * @author nvn
 * @created 12/23/2023 - 9:37 AM
 */
public interface ItemBO {
    List<ItemDTO> getAll() throws SQLException, ClassNotFoundException;

    boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException;

    boolean delete(String id) throws SQLException, ClassNotFoundException;

    boolean exist(String id) throws SQLException, ClassNotFoundException ;

    String generateNextId() throws SQLException, ClassNotFoundException ;
    ItemDTO getDetail(String id) throws SQLException, ClassNotFoundException;

}
