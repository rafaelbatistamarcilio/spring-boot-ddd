package com.dddapp.domain1.interfaces;

import com.dddapp.domain1.model.Domain1Exception;
import com.dddapp.domain1.model.MyDomain1Entity;

public interface IDomain1Service {
    MyDomain1Entity findByName(String name);

    MyDomain1Entity add(MyDomain1Entity entity) throws Domain1Exception;
}
