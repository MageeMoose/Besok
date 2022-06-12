package com.example.mig_besok.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mig_besok.model.Visitor
import com.example.mig_besok.repository.VisitorRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

class VisitorViewModel @Inject constructor(private val repository: VisitorRepository): ViewModel(){
  private val _visitorList = MutableStateFlow<List<Visitor>>(emptyList())
  val visitorList = _visitorList.asStateFlow()

  init {
      viewModelScope.launch(Dispatchers.IO) {
          repository.getAllVisitors().distinctUntilChanged().collect{ listOfVisitors ->
              if (listOfVisitors.isNullOrEmpty() ){
                  Log.d("Empty", ":Empty list ")
              }else{
                  _visitorList.value = listOfVisitors
              }

          }
      }
  }

    fun addVisitor(visitor: Visitor) = viewModelScope.launch { repository.addVisitor(visitor) }
    fun updateVisitor(visitor: Visitor) = viewModelScope.launch { repository.updateVisitor(visitor)}
    fun removeVisitor(visitor: Visitor) = viewModelScope.launch { repository.deleteVisitor(visitor) }
}
