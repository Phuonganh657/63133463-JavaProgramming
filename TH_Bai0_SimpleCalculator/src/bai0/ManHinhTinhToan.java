package bai0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel_1.setBounds(24, 66, 148, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ hai (b)");
		lblNewLabel.setBounds(24, 157, 148, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setBounds(201, 54, 354, 41);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(201, 149, 354, 41);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG ");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý cộng
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(62, 223, 89, 41);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(201, 223, 89, 41);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(329, 223, 89, 41);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(466, 223, 89, 41);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(24, 302, 148, 20);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(201, 298, 354, 32);
		contentPane.add(txtKetQua);
	}
	//het ham tao
	protected void HamXuLyCong() {
		// TODO Auto-generated method stub
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA+soB;
		txtKetQua.setText(String.valueOf(tong));
		
	}
	protected void HamXuLyTru() {
		// TODO Auto-generated method stub
			String str_soA = txtA.getText();
			String str_soB = txtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double hieu = soA-soB;
			txtKetQua.setText(String.valueOf(hieu));
	}
	protected void HamXuLyNhan() {
		// TODO Auto-generated method stub
			String str_soA = txtA.getText();
			String str_soB = txtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double tich = soA*soB;
			txtKetQua.setText(String.valueOf(tich));
	}
	protected void HamXuLyChia() {
		// TODO Auto-generated method stub
			String str_soA = txtA.getText();
			String str_soB = txtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double thuong = soA/soB;
			txtKetQua.setText(String.valueOf(thuong));
	}
}
