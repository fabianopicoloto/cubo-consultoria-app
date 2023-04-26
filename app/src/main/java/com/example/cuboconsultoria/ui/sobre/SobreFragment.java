package com.example.cuboconsultoria.ui.sobre;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.cuboconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SobreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SobreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SobreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SobreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SobreFragment newInstance(String param1, String param2) {
        SobreFragment fragment = new SobreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "A Cubo Consultoria é uma empresa de consultoria em arquitetura que fornece soluções personalizadas " +
                "para nossos clientes. Nós oferecemos uma ampla gama de serviços, desde design sustentável e gerenciamento de " +
                "projetos até consultoria em planejamento urbano. Nosso compromisso com a excelência em atendimento ao cliente " +
                "e qualidade do trabalho é o que nos diferencia de outras empresas de consultoria em arquitetura.";

        Element versao = new Element();
        versao.setTitle("Versã0 1.0.4");

        //getActivity esta dentro do fragment e permite acessar o contexto da MainActivity
        return new AboutPage(getActivity())
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@cubo.com.br", "Envie um e-mail")
                .addWebsite("http://cuboconsultoria.com.br", "Acesse nosso site")


                .addGroup("Redes sociais")
                .addFacebook("cuboconsultoria", "Facebook")
                .addInstagram("cuboconsultoria", "Instagram")
                .addTwitter("cuboconsultoria", "Twitter")
                .addYoutube("cuboconsultoria", "Youtube")
                .addItem(versao)

                .create();
    }
}