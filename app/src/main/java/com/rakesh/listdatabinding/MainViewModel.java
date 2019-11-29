package com.rakesh.listdatabinding;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class MainViewModel extends AndroidViewModel {
  private EmployeeRepository employeeRepository;
 
  public MainViewModel(@NonNull Application application) {
    super(application);
    employeeRepository = new EmployeeRepository();
  }
 
  public LiveData<List<Employee>> getAllEmployee() {
    return employeeRepository.getMutableLiveData();
  }
}