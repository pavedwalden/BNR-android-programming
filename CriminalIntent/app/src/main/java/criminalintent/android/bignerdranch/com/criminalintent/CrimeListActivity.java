package criminalintent.android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by alexrice on 5/21/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
