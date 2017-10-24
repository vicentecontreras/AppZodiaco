package cl.raion.zodiac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class LeoActivity extends AppCompatActivity {
    ImageView imgzodiac;
    TextView nombrezodiac,tvzodiacfechas,tvZodiacDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_description);
        imgzodiac = (ImageView) findViewById(R.id.imgZodiac);
        imgzodiac.setImageResource(R.drawable.leo);
        nombrezodiac = (TextView) findViewById(R.id.tvSelectedZodiac);
        nombrezodiac.setText(R.string.leo);
        tvzodiacfechas = (TextView) findViewById(R.id.tvZodiacFechas);
        tvzodiacfechas.setText(R.string.txt_leo_fecha);
        tvZodiacDesc = (TextView) findViewById(R.id.tvZodiacDesc);
        tvZodiacDesc.setText(R.string.txt_leo_desc);
    }
}
