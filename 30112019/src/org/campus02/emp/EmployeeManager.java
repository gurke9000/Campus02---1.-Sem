package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeManager {

        ArrayList<Employee> list = new ArrayList<>();

        public void addEmp(Employee e)
        {
            if(!list.contains(e)) {
                list.add(e);
            }
        }

        public Employee findByEmpNumb(int number)
        {
            for(Employee e: list)
                if(e.getEmpNumber() == number)
                {
                   return e;
                }
               return null;
        }

        public ArrayList<Employee> findByDep(String department)
        {
            ArrayList<Employee> erg = new ArrayList<>();
            for(Employee e : list)
            {
                if(e.getDepartment().equals(department))
                {
                    erg.add(e);
                }
            }
            return erg;
        }

    public ArrayList<Employee> getList() {
        return list;
    }
/*
        public Employee findByMaxSal()
        {
            int maxsal;
            for(int i = 0; i < list.length();i++)
            {

            }
        }

 */

}
