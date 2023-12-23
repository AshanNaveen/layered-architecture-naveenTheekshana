package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.List;

/**
 * @author nvn
 * @created 12/23/2023 - 9:39 AM
 */
public class ItemBOImpl implements ItemBO {
    ItemBO itemBO = new ItemBOImpl();

    @Override
    public List<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemBO.getAll();
    }

    @Override
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemBO.save(dto);
    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemBO.update(dto);
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return itemBO.delete(id);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return itemBO.exist(id);
    }

    @Override
    public String generateNextId() throws SQLException, ClassNotFoundException {
        return itemBO.generateNextId();
    }

    @Override
    public ItemDTO getDetail(String id) throws SQLException, ClassNotFoundException {
        return itemBO.getDetail(id);
    }

}

