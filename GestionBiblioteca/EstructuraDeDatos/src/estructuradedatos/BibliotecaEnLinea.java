import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Clase principal para la biblioteca en línea
public class BibliotecaEnLinea extends JFrame {
    private LinkedList<Libro> catalogo;
    private Queue<Transaccion> transaccionesPrestamo;
    private Stack<Transaccion> transaccionesDevolucion;

    private JList<Libro> listaLibros; // Nuevo componente para mostrar la lista de libros
   
    public BibliotecaEnLinea() {
        catalogo = new LinkedList<>();
        transaccionesPrestamo = new LinkedList<>();
        transaccionesDevolucion = new Stack<>();
        // Crear componente de botón para ir a la página de inicio
        JButton btnInicio = new JButton("Inicio");

        // Agregar libros de matematicas al catalogo
        catalogo.add(new Libro("Cálculo Integral", "Libro de cálculo integral para estudiantes avanzados.", 2020, new ImageIcon("ruta/a/la/imagen1.jpg")));
        catalogo.add(new Libro("Estadísticas y Probabilidades", "Estudio estadístico y probabilístico aplicado.", 2021, new ImageIcon("ruta/a/la/imagen3.jpg")));
        catalogo.add(new Libro("Álgebra Lineal", "Conceptos fundamentales de álgebra lineal.", 2021, new ImageIcon("ruta/a/la/imagen3.jpg")));
        catalogo.add(new Libro("Cálculo Diferencial", "Libro de cálculo diferencial para principiantes.", 2021, new ImageIcon("ruta/a/la/imagen3.jpg")));
        catalogo.add(new Libro("Introducción a la Teoría de Números", "Principios básicos de la teoría de números.", 2019, new ImageIcon("ruta/a/la/imagen2.jpg")));
        catalogo.add(new Libro("Álgebra Abstracta", "Conceptos avanzados de álgebra abstracta.", 2020, new ImageIcon("ruta/a/la/imagen1.jpg")));
        catalogo.add(new Libro("Matemáticas Discretas", "Conceptos fundamentales de matemáticas discretas.", 2019, new ImageIcon("ruta/a/la/imagen2.jpg")));
        
        //Agrega libros programacion al catalogo
        catalogo.add(new Libro("Algoritmos y Estructuras de Datos", "Introducción a algoritmos y estructuras de datos.", 2019, new ImageIcon("ruta/a/la/imagen2.jpg")));
        catalogo.add(new Libro("Programación en Java", "Guía completa de programación en Java.", 2020, new ImageIcon("ruta/a/la/imagen1.jpg")));
        catalogo.add(new Libro("Introducción a Python", "Aprende los conceptos básicos de Python.", 2019, new ImageIcon("ruta/a/la/imagen2.jpg")));
        catalogo.add(new Libro("Estructuras de Datos Avanzadas", "Estudio detallado de estructuras de datos avanzadas.", 2020, new ImageIcon("ruta/a/la/imagen1.jpg")));
        catalogo.add(new Libro("Desarrollo Web con JavaScript", "Aprende a desarrollar aplicaciones web con JavaScript.", 2021, new ImageIcon("ruta/a/la/imagen3.jpg")));
        catalogo.add(new Libro("Programación Orientada a Objetos", "Principios de programación orientada a objetos.", 2019, new ImageIcon("ruta/a/la/imagen2.jpg")));
        catalogo.add(new Libro("Desarrollo de Aplicaciones Móviles", "Guía para desarrollar aplicaciones móviles.", 2020, new ImageIcon("ruta/a/la/imagen1.jpg")));
        catalogo.add(new Libro("Introducción a la Programación en C++", "Principios básicos de la programación en C++.", 2021, new ImageIcon("ruta/a/la/imagen3.jpg")));
        
        // Agrega libros de medicina al catálogo
        catalogo.add(new Libro("Medicina 1", "Descripción Medicina 1", 2022, new ImageIcon("ruta/a/la/imagen4.jpg")));
        catalogo.add(new Libro("Medicina 2", "Descripción Medicina 2", 2022, new ImageIcon("ruta/a/la/imagen5.jpg")));
        catalogo.add(new Libro("Anatomía Humana", "Estudio detallado de la anatomía humana.", 2021, new ImageIcon("ruta/a/la/imagen6.jpg")));
        catalogo.add(new Libro("Medicina 3", "Descripción Medicina 3", 2023, new ImageIcon("ruta/a/la/imagen10.jpg")));
        catalogo.add(new Libro("Farmacología Avanzada", "Estudio de los fármacos y su aplicación.", 2023, new ImageIcon("ruta/a/la/imagen11.jpg")));

        // Agrega libros de derecho al catálogo
        catalogo.add(new Libro("Derecho Constitucional", "Principios fundamentales de la Constitución.", 2021, new ImageIcon("ruta/a/la/imagen7.jpg")));
        catalogo.add(new Libro("Derecho Penal", "Estudio de los principios del derecho penal.", 2020, new ImageIcon("ruta/a/la/imagen8.jpg")));
        catalogo.add(new Libro("Derecho Civil", "Conceptos básicos del derecho civil.", 2022, new ImageIcon("ruta/a/la/imagen9.jpg")));
        catalogo.add(new Libro("Derecho Internacional", "Principios del derecho a nivel internacional.", 2023, new ImageIcon("ruta/a/la/imagen12.jpg")));
        catalogo.add(new Libro("Derecho Laboral", "Normas que rigen las relaciones laborales.", 2022, new ImageIcon("ruta/a/la/imagen13.jpg")));
        
        // Agrega libros de lenguas modernas al catálogo
        catalogo.add(new Libro("Inglés Avanzado", "Mejora tu dominio del inglés con este libro.", 2023, new ImageIcon("ruta/a/la/imagen14.jpg")));
        catalogo.add(new Libro("Francés para Principiantes", "Aprende los fundamentos del francés.", 2022, new ImageIcon("ruta/a/la/imagen15.jpg")));
        catalogo.add(new Libro("Alemán Intermedio", "Desarrolla tus habilidades en alemán.", 2023, new ImageIcon("ruta/a/la/imagen16.jpg")));
        catalogo.add(new Libro("Chino Mandarín Básico", "Introducción al idioma chino mandarín.", 2022, new ImageIcon("ruta/a/la/imagen17.jpg")));
        catalogo.add(new Libro("Italiano para Viajeros", "Aprende italiano útil para tus viajes.", 2021, new ImageIcon("ruta/a/la/imagen18.jpg")));

        
        // Configurar la interfaz gráfica
        setTitle("Biblioteca del rincon");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componente de etiqueta para el título
        JLabel lblTitulo = new JLabel("Bienvenido");
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 70));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);

        // Crear componentes de la interfaz
        JButton btnPrestamo = new JButton("Prestar Libro");
        JButton btnDevolucion = new JButton("Devolver Libro");

        // Crear lista de libros y asignar modelo
        DefaultListModel<Libro> model = new DefaultListModel<>();
        for (Libro libro : catalogo) {
            model.addElement(libro);
        }
        listaLibros = new JList<>(model);
        listaLibros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Personalizar colores y fuentes
        Color colorFondo = new Color(128, 0, 128); // Color morado
        Color colorBotones = new Color(128, 0, 128); // Color negro
        Color colorLetra = Color.WHITE; // Color blanco
        Font fuenteBotones = new Font("Times New Roman", Font.BOLD, 24);

        // Aplicar colores y fuentes a los componentes
        getContentPane().setBackground(colorFondo);  // Establecer color de fondo del JFrame
        lblTitulo.setForeground(colorLetra);         // Establecer color de letra del título
        btnPrestamo.setBackground(colorBotones);
        btnDevolucion.setBackground(colorBotones);
        btnPrestamo.setFont(fuenteBotones);
        btnDevolucion.setFont(fuenteBotones);
        
        // Cambiar color de letra de los botones
        btnPrestamo.setForeground(Color.WHITE);
        btnDevolucion.setForeground(Color.WHITE);

        // Agregar acciones a los botones
        btnPrestamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prestarLibro();
                actualizarCatalogo();
            }
        });

        btnDevolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                devolverLibro();
                actualizarCatalogo();
            }
        });

        // Configurar el diseño de la interfaz
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 2));
        panelBotones.add(btnPrestamo);
        panelBotones.add(btnDevolucion);

        JPanel panelPrincipal = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(colorFondo);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panelPrincipal.add(lblTitulo, BorderLayout.NORTH);
        panelPrincipal.add(crearPanelCatalogo(), BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        add(panelPrincipal);

        actualizarCatalogo();
    }

    private JScrollPane crearPanelCatalogo() {
        JPanel panelCatalogo = new JPanel();
        panelCatalogo.setLayout(new GridLayout(0, 3, 10, 10)); // 3 columnas, espacio horizontal y vertical de 10 píxeles

        for (Libro libro : catalogo) {
            panelCatalogo.add(crearPanelLibro(libro));
        }

        JScrollPane scrollPane = new JScrollPane(panelCatalogo);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        return scrollPane;
    }

    private JButton crearPanelLibro(Libro libro) {
    JButton btnLibro = new JButton();
    btnLibro.setLayout(new BorderLayout());
    btnLibro.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

    // Crear componente de etiqueta para la imagen del libro
    JLabel lblImagen = new JLabel(libro.getImagen());
    lblImagen.setHorizontalAlignment(JLabel.CENTER);

    // Crear componente de etiqueta para el título del libro
    JLabel lblTituloLibro = new JLabel(libro.getTitulo());
    lblTituloLibro.setFont(new Font("Arial", Font.BOLD, 16));
    lblTituloLibro.setHorizontalAlignment(JLabel.CENTER);

    // Crear componente de etiqueta para el año del libro
    JLabel lblAnioLibro = new JLabel("Año: " + libro.getAnio());
    lblAnioLibro.setHorizontalAlignment(JLabel.CENTER);

    // Crear componente de etiqueta para la descripción del libro
    JLabel lblDescripcionLibro = new JLabel("<html>" + libro.getDescripcion() + "</html>");
    lblDescripcionLibro.setFont(new Font("Arial", Font.PLAIN, 14));
    lblDescripcionLibro.setHorizontalAlignment(JLabel.CENTER);

    // Agregar componentes al panel del libro
    btnLibro.add(lblImagen, BorderLayout.NORTH);
    btnLibro.add(lblTituloLibro, BorderLayout.CENTER);
    btnLibro.add(lblAnioLibro, BorderLayout.SOUTH);
    btnLibro.add(lblDescripcionLibro, BorderLayout.SOUTH);

    // Hacer que el botón sea seleccionable simulando un clic
    btnLibro.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btnLibro.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            listaLibros.setSelectedValue(libro, true);
        }
    });

    return btnLibro;
}
    private void prestarLibro() {
        Libro libroSeleccionado = listaLibros.getSelectedValue();
        if (libroSeleccionado != null) {
            // Preguntar por la información adicional usando un cuadro de diálogo
            String nombrePrestatario = JOptionPane.showInputDialog(this, "Nombre del prestatario:");
            
            // Validar que se haya ingresado un nombre de prestatario
            if (nombrePrestatario == null || nombrePrestatario.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa el nombre del prestatario.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            String diasReservaStr = JOptionPane.showInputDialog(this, "Número de días de reserva, con un máximo de 7:");
            int diasReserva = 0;

            // Validar la entrada para asegurarse de que es un número entero
            try {
                diasReserva = Integer.parseInt(diasReservaStr);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido de días.");
                return;
            }

            // Validar que el número de días esté dentro del rango permitido
            if (diasReserva <= 0 || diasReserva > 7) {
                JOptionPane.showMessageDialog(this, "El número de días debe estar entre 1 y 7.");
                return;
            }

            // Realizar la transacción si la validación es exitosa
            catalogo.remove(libroSeleccionado);
            transaccionesPrestamo.offer(new Transaccion(libroSeleccionado, true, nombrePrestatario, diasReserva));
            JOptionPane.showMessageDialog(this, "Libro prestado:\n" + libroSeleccionado.toString() +
                    "\nA nombre de: " + nombrePrestatario + "\nDías de reserva: " + diasReserva);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un libro para prestar.");
        }
    }

    private void devolverLibro() {
        if (!transaccionesPrestamo.isEmpty()) {
            Transaccion transaccionDevolucion = transaccionesPrestamo.poll();
            transaccionesDevolucion.push(transaccionDevolucion);
            catalogo.add(transaccionDevolucion.libro);
            JOptionPane.showMessageDialog(this, "Libro devuelto:\n" + transaccionDevolucion.libro.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No hay libros para devolver.");
        }
    }

    private void actualizarCatalogo() {
        DefaultListModel<Libro> model = new DefaultListModel<>();
        for (Libro libro : catalogo) {
            model.addElement(libro);
        }
        listaLibros.setModel(model);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BibliotecaEnLinea().setVisible(true);
            }
        });
    }
}