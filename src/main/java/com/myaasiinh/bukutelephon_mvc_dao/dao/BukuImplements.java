package com.myaasiinh.bukutelephon_mvc_dao.dao;

import com.myaasiinh.bukutelephon_mvc_dao.model.BukuTelephon;

import java.util.List;

public interface BukuImplements {

    public void insert(BukuTelephon b);

    public void update(BukuTelephon b);

    public void delete(BukuTelephon id);

    public BukuTelephon getId(int id);

    public List<BukuTelephon> getALL();

    public void getCariNama(String nama);

    List<BukuTelephon> search(BukuTelephon buku);
}
