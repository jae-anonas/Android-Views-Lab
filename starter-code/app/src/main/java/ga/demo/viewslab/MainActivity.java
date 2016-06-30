package ga.demo.viewslab;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     *
     LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
     LayoutInflater li =  (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
     for (int i = 0; i < mainList.size();  i++){
     View tempView = li.inflate(R.layout.listtemplate, null);
     TextView textMain = (TextView) tempView.findViewById(R.id.mainText);

     textMain.setText(mainList.get(i));
     mainLayout.addView(tempView);
     }
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Put your Java code in here
//        ScrollView mainLayout = (ScrollView) findViewById(R.id.scrollView);
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.linear);
        LayoutInflater li = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int i;
        for (i = 1; i < 20; i+=2){
            View tempView = li.inflate(R.layout.template, null);
            TextView textView1 = (TextView) tempView.findViewById(R.id.textView_1);
            TextView textView2 = (TextView) tempView.findViewById(R.id.textView_2);
            Button btn1 = (Button) tempView.findViewById(R.id.button_1);
            String str = "You clicked on the button below views number " + i + " and " + (i+1);

            btn1.setTag(str);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), view.getTag().toString(), Toast.LENGTH_SHORT).show();
                }
            });

            textView1.setText("This is TextView number " + i);
            textView2.setText("This is TextView number " + (i + 1));



            mainLayout.addView(tempView);

        }

    }
}
