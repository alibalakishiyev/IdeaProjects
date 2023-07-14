package az.com.nemesisyazilim.dal;

import az.com.nemesisyazilim.core.ObjectHelper;
import az.com.nemesisyazilim.interfaces.DALInterfaces;
import az.com.nemesisyazilim.type.KategoriContract;

import java.util.List;

public class KategoriDAL<KategoriContract> extends ObjectHelper implements DALInterfaces<KategoriContract> {


    @Override
    public void Insert(KategoriContract entity) {

    }

    @Override
    public List<KategoriContract> GetAll() {
        return null;
    }

    @Override
    public KategoriContract Delete(KategoriContract entity) {
        return null;
    }

    @Override
    public List<KategoriContract> GetById(int id) {
        return null;
    }
}
