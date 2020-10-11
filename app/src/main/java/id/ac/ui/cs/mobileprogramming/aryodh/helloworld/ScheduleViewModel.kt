package id.ac.ui.cs.mobileprogramming.aryodh.helloworld

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScheduleViewModel : ViewModel() {

    val schedule = MutableLiveData<List<String>>()

    fun setSchedule(schedule: List<String>){
        this.schedule.value = schedule
    }
}

