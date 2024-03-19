package ru.sidorovan.HW._9.Libraries.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import ru.sidorovan.HW._9.Libraries.exception.InvalidEmployeeDataException;
import ru.sidorovan.HW._9.Libraries.service.EmployeeValidationService;

@Service
public class EmployeeValidationServiceImpl implements EmployeeValidationService {
    @Override
    public void validate(String firstName, String lastName) {
        validateName(firstName);
        validateName(lastName);
    }
    private void validateName(String name){
        if (!StringUtils.isAlpha(name)){
            throw  new InvalidEmployeeDataException("Некорректное имя сотрудника");
        }
     }
}
