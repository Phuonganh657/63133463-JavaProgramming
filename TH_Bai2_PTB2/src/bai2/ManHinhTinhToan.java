package bai2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setTitle("PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(64, 63, 156, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(64, 115, 156, 28);
		contentPane.add(lblNhpSTh);
		
		JLabel lblNhpSTh_1 = new JLabel("Nhập số thứ ba (b)");
		lblNhpSTh_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh_1.setBounds(64, 170, 156, 28);
		contentPane.add(lblNhpSTh_1);
		
		JLabel lblPhngTrnhAx = new JLabel("Phương trình ax^2 + bx +c =0");
		lblPhngTrnhAx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhngTrnhAx.setBounds(64, 11, 239, 28);
		contentPane.add(lblPhngTrnhAx);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(351, 63, 215, 28);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(351, 115, 215, 28);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(351, 170, 215, 28);
		contentPane.add(txtC);
		
		JButton btnKetQua = new JButton("KẾT QUẢ");
		btnKetQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inKetQua();
			}
		});
		btnKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKetQua.setBounds(64, 234, 134, 28);
		contentPane.add(btnKetQua);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(351, 234, 215, 28);
		contentPane.add(txtKetQua);
	}
	
	protected void inKetQua() {
		// TODO Auto-generated method stub
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		String str_c = txtC.getText();
		double a = Double.parseDouble(str_a);
		double b = Double.parseDouble(str_b);
		double c = Double.parseDouble(str_c);
		String ketqua = null;
        
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                ketqua = "Phương trình vô nghiệm!";
            } else {
                ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
        }
        // tính delta
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 
                    + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            ketqua = "Phương trình vô nghiệm!";
        }
         
        txtKetQua.setText(ketqua);
	}

}
