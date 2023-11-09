
INSERT INTO piezas (codigo, nombre) VALUES
(1, 'Tuerca'),
(2, 'Perno'),
(3, 'Arandela'),
(4, 'Engranaje'),
(5, 'Resorte');

INSERT INTO proveedores (id, nombre) VALUES
('P001', 'Proveedor A'),
('P002', 'Proveedor B'),
('P003', 'Proveedor C'),
('P004', 'Proveedor D'),
('P005', 'Proveedor E');

INSERT INTO suministra (codigoPieza, id_proveedor, precio) VALUES
(1, 'P001', 100),
(1, 'P002', 110),
(1, 'P003', 95),
(2, 'P001', 80),
(2, 'P004', 90),
(3, 'P002', 70),
(3, 'P005', 75),
(4, 'P003', 120),
(4, 'P004', 130),
(5, 'P001', 50),
(5, 'P002', 60),
(5, 'P003', 55);
