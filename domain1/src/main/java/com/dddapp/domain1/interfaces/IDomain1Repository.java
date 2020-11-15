package com.dddapp.domain1.interfaces;

import com.dddapp.domain1.model.MyDomain1Entity;

public interface IDomain1Repository {
    MyDomain1Entity findByName(String name);

    MyDomain1Entity add(MyDomain1Entity entity);
}
