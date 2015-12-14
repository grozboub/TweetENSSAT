package gazouilli.enssat.fr.tweetenssat;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.twitter.sdk.android.tweetui.SearchTimeline;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;

public class timeline extends AppCompatActivity {

    public class SearchTimelineFragment extends ListFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            final SearchTimeline searchTimeline = new SearchTimeline.Builder()
                    .query("#enssat")
                    .build();
            final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(getActivity())
                    .setTimeline(searchTimeline)
                    .build();
            setListAdapter(adapter);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.timeline, container, false);
        }
    }


}
