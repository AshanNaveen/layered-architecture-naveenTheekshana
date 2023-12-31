package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.util.CrudUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public List<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.crudUtil("SELECT * FROM Customer");
        List<CustomerDTO> list = new ArrayList<>();
        while (rst.next()){
            list.add(new CustomerDTO(
                    rst.getString("id"),
                    rst.getString("name"),
                    rst.getString("address")));
        }
        return list;
    }
    @Override
    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.crudUtil("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",dto.getId(),dto.getName(),dto.getAddress());
    }
    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return CrudUtil.crudUtil("UPDATE Customer SET name=?, address=? WHERE id=?",dto.getName(),dto.getAddress(),dto.getId());
    }
    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return CrudUtil.crudUtil("DELETE FROM Customer WHERE id=?",id);

    }
    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst=CrudUtil.crudUtil("SELECT id FROM Customer WHERE id=?",id);
        return rst.next();
    }
    @Override
    public String generateNextId() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.crudUtil("SELECT id FROM Customer ORDER BY id DESC LIMIT 1");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }
    @Override
    public CustomerDTO getDetail(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.crudUtil("SELECT * FROM Customer WHERE id=?",id);
        if(rst.next()){
            return new CustomerDTO( rst.getString("id"),
                    rst.getString("name"),
                    rst.getString("address")
            );
        }
        return null;
    }

}
