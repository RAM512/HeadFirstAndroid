package ru.alexrodionov.workout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutId;


    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View rootView = getView();
        Workout workout = Workout.workouts[(int) workoutId];
        TextView title = (TextView) rootView.findViewById(R.id.textTitle);
        title.setText(workout.getName());
        TextView description = (TextView) rootView.findViewById(R.id.textDescription);
        description.setText(workout.getDescription());
    }

    public void setWorkoutId(long workoutId) {
        this.workoutId = workoutId;
    }

}
