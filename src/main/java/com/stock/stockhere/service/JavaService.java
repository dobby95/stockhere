package com.stock.stockhere.service;

import com.stock.stockhere.repository.UserRepository;
import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaService {

    private static PythonInterpreter intPre;

    @Autowired
    UserRepository userRepository;

//    기업정보 불러오기 테스트
    public String getCor(String no){
        intPre = new PythonInterpreter();
        intPre.execfile("src/main/resources/static/fdr_test.py");
//        intPre.exec("TEST");
        PyFunction pyFunction = (PyFunction) intPre.get("getCor", PyFunction.class);
        PyObject pyObject = pyFunction.__call__(new PyString(no));
        System.out.println(pyObject.toString());

        return pyObject.toString();
    }


}
