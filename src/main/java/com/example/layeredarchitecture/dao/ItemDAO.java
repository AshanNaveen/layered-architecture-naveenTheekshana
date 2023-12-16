package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO {
        List<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException ;
        boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
        boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
        boolean existsItem(String code) throws SQLException, ClassNotFoundException ;
        boolean deleteItem(String code) throws SQLException, ClassNotFoundException ;
        String generateNextId() throws SQLException, ClassNotFoundException ;
        ItemDTO getItemDetail(String code) throws SQLException, ClassNotFoundException ;

}
