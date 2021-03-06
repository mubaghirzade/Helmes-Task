INSERT INTO
    sector(id, value, parent_id, margin)
VALUES
(1, 'Manufacturing',NULL, 0),
(19, 'Construction materials', 1, 15),
(18, 'Electronics and Optics', 1, 15),
(6, 'Food and Beverage', 1, 15),
(342, 'Bakery & confectionery products', 6, 30),
(43, 'Beverages', 6, 30),
(42, 'Fish & fish products', 6, 30 ),
(40, 'Meat & meat products', 6, 30 ),
(39, 'Milk & dairy products', 6, 30 ),
(437, 'Other', 6, 30 ),
(378, 'Sweets & snack food', 6, 30 ),
(13, 'Furniture', 1, 15 ),
(389, 'Bathroom/sauna', 13, 30 ),
(385, 'Bedroom', 13, 30 ),
(390, 'Children`s room', 13, 30 ),
(98, 'Kitchen', 13, 30 ),
(101, 'Living room', 13, 30 ),
(392, 'Office', 13, 30 ),
(394, 'Other (Furniture)', 13, 30 ),
(341, 'Outdoor', 13, 30 ),
(99, 'Project furniture', 13, 30 ),
(12, 'Machinery', 1, 15 ),
(94, 'Machinery components', 12, 30 ),
(91, 'Machinery equipment/tools', 12, 30 ),
(224, 'Manufacture of machinery', 12, 30 ),
(97, 'Maritime', 12, 30 ),
(271, 'Aluminium and steel workboats', 97, 45 ),
(269, 'Boat/Yacht building', 97, 45 ),
(230, 'Ship repair and conversion', 97, 45 ),
(93, 'Metal structures', 12, 30 ),
(508, 'Other', 12, 30 ),
(2215, 'Repair and maintenance service', 12, 30 ),
(11, 'Metalworking', 1, 15 ),
(67, 'Construction of metal structures', 11, 30 ),
(263, 'Houses and buildings', 11, 30 ),
(267, 'Metal products', 11, 30 ),
(542, 'Metal works', 11, 30 ),
(75, 'CNC-machining', 542, 45 ),
(62, 'Forgings, Fasteners', 542, 45 ),
(69, 'Gas, Plasma, Laser cutting', 542, 45 ),
(66, 'MIG, TIG, Aluminum welding', 542, 45 ),
(9, 'Plastic and Rubber', 1, 15 ),
(54, 'Packaging', 9, 30 ),
(556, 'Plastic goods', 9, 30 ),
(559, 'Plastic processing technology', 9, 30 ),
(55, 'Blowing', 559, 45 ),
(57, 'Moulding', 559, 45 ),
(53, 'Plastics welding and processing', 559, 45 ),
(560, 'Plastic profiles', 9, 30 ),
(5, 'Printing', 1, 15 ),
(148, 'Advertising', 5, 30 ),
(150, 'Book/Periodicals printing', 5, 30 ),
(145, 'Labelling and packaging printing', 5, 30 ),
(7, 'Textile and Clothing', 1, 15 ),
(44, 'Clothing', 7, 30 ),
(45, 'Textile', 7, 30 ),
(8, 'Wood', 1, 15 ),
(337, 'Other (Wood)', 8, 30 ),
(51, 'Wooden building materials', 8, 30 ),
(47, 'Wooden houses', 8, 30 ),
(3, 'Other', NULL, 0 ),
(37, 'Creative industries', 3, 15 ),
(29, 'Energy technology', 3, 15 ),
(33, 'Environment', 3, 15 ),
(2, 'Service', NULL, 0 ),
(25, 'Business services', 2, 15 ),
(35, 'Engineering', 2, 15 ),
(28, 'Information Technology and Telecommunications', 2, 15 ),
(581, 'Data processing, Web portals, E-marketing', 28, 30 ),
(576, 'Programming, Consultancy', 28, 30 ),
(121, 'Software, Hardware', 28, 30 ),
(122, 'Telecommunications', 28, 30 ),
(22, 'Tourism', 2, 15 ),
(141, 'Translation services', 2, 15 ),
(21, 'Transport and Logistics', 2, 15 ),
(111, 'Air', 21, 30 ),
(114, 'Rail', 21, 30 ),
(112, 'Road', 21, 30 ),
(113, 'Water', 21, 30 );