package com.braincraftapps.gourmet.fragments.NawDrawerFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.RecipesActivity;
import com.braincraftapps.gourmet.adapter.CategoryGridAdapter;
import com.braincraftapps.gourmet.data.IReadable;
import com.braincraftapps.gourmet.data.IUowData;
import com.braincraftapps.gourmet.data.UowData;
import com.braincraftapps.gourmet.model.Category;
import com.braincraftapps.gourmet.vm.CategoryVM;
import com.braincraftapps.gourmet.vm.ViewModelHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Sysoiev on 02.03.2015.
 */
public class CategoryFragment extends Fragment {
    private GridView mGridView;

    private IUowData uowData;
    private ViewModelHelper viewModelHelper;
    private CategoryVM category;

    public static final String CATEGORY_IMAGE = "category_image";

/*    private TextView mTextView;*/


    public CategoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragment = inflater.inflate(R.layout.fragment_category, container, false);

        mGridView = (GridView) fragment.findViewById(R.id.gridView);
       // mTextView = (TextView) fragment.findViewById(R.id.category_title);
        uowData = new UowData(getActivity());
        ((IReadable) uowData).open();

        viewModelHelper = new ViewModelHelper(uowData);


        List<Category> categories = uowData.getCategories().findAll();


        ArrayList<CategoryVM> categoryVM = (ArrayList<CategoryVM>) viewModelHelper.getCategoryVM(categories);

        CategoryGridAdapter adapter = new CategoryGridAdapter(getActivity(), categoryVM);
        mGridView.setAdapter(adapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), RecipesActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);
                Toast.makeText(getActivity(), "Item: " + Long.toString(mGridView.getItemIdAtPosition(position)), Toast.LENGTH_SHORT).show();
            }
        });

        return fragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

   /* @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (FragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + "must implement FragmentListener");
        }
        mListener.onAttachFragment();
    }*/

    public interface FragmentListener {
        public void onAttachFragment();
    }
}
