package com.example.dinnerdecider

data class Food(var name : String, var desc : String, var calories : Int)//since arrays of classes in handled, data class is needed instead of normal arrays

object Supplier{
    var foods = mutableListOf<Food>(
        Food("Apple" , "A common fruit. Has a red skin and a white-yellow flesh when ripe.", 30),
        Food("Apple Pie" , "Commonly served in McDonalds, it consists of crust made from wheat and fillings of cooked apples", 410),
        Food("Avacado" , "A fruit that has a very big seed and soft, mushy greenish flesh", 143),
        Food("Banana Split" , "Often served as a dessert, consists of ice cream and banana", 130),
        Food("Bagel" , "A ring bakery which may or may not have fillings", 71),
        Food("Baked beans" , "Often canned with tomato sauce. A popular English food", 155),
        Food("Bacon" , "Processed pork, normally served with seasoning and herbs", 140),
        Food("BBQ" , "Foods such as pork, chicken, vegetables are grilled with charcoal and butter", 210),
        Food("Beer" , "A traditional alchoholic drink made from malt", 153),
        Food("Bread (White)" , "A plain bakery made from wheat", 24),
        Food("Burrito" , "Plenty of ingredients consists of different meats and vegetables wrapped in a toasted bakery sheet", 300),
        Food("Cake(Sponge)" , "Sponge cake is a light cake made with eggs, flour and sugar, sometimes leavened with baking powder.", 187),
        Food("Carrots" , "The carrot is a root vegetable, usually orange in colour, though purple, black, red, white, and yellow cultivars exist. ", 1),
        Food("Chicken (Roasted)" , "Roast chicken is chicken prepared as food by roasting whether in a home kitchen, over a fire, or with a rotisserie.", 142),
        Food("Chicken Rice" , "Chicken rice is a dish of poached chicken and seasoned rice, served with chilli sauce and usually comes with cucumber garnishes.", 666),
        Food("Chips" , " or simply fries, chips, finger chips, or french-fried potatoes, are batonnet or allumette-cut deep-fried potatoes.", 267),
        Food("Coffee" , "Coffee is a brewed drink prepared from roasted coffee beans, the seeds of berries from certain Coffea species", 73),
        Food("Cookies" , "A cookie is a baked or cooked food that is typically small, flat and sweet. It usually contains flour, sugar and some type of oil or fat.", 70),
        Food("Corn" , "Corn or maize is a cereal grain first domesticated by indigenous peoples in southern Mexico about 10,000 years ago.", 133),
        Food("Cupcakes" , "A cupcake is a small cake designed to serve one person, which may be baked in a small thin paper or aluminum cup.", 200),
        Food("Crab" , "Crabs are decapod crustaceans of the infraorder Brachyura, which typically have a very short projecting \"tail\"", 93),
        Food("Curry" , "Curry is a variety of dishes originating in the Indian subcontinent that use a complex combination of spices or herbs, usually including ground turmeric, cumin, coriander, ginger, and fresh or dried chilies", 119),
        Food("Cereal" , "A cereal is any grass cultivated for the edible components of its grain, composed of the endosperm, germ, and bran.", 10),
        Food("Dumplings" , "Dumpling is a broad classification for a dish that consists of pieces of dough wrapped around a filling or of dough with no filling. The dough can be based on bread, flour or potatoes, and may be filled with meat, fish, cheese, vegetables, fruits or sweets.", 225),
        Food("Donuts" , "A doughnut or donut is a type of fried dough confection or dessert food. The doughnut is popular in many countries and is prepared in various forms as a sweet snack that can be homemade or purchased in bakeries, supermarkets, food stalls, and franchised specialty vendors.", 52),
        Food("Eggs(Fried)" , "A fried egg is a cooked dish made from one or more eggs which are removed from their shells and placed into a pan, usually without breaking the yolk, and fried with minimal accompaniment. Fried eggs are traditionally eaten for breakfast in many countries but may also be served at other times of the day.", 77),
        Food("Eggrolls" , "Egg rolls are a variety of deep-fried appetizers served in American Chinese restaurants. An egg roll is a cylindrical, savory roll with shredded cabbage, chopped pork, and other fillings inside a thickly-wrapped wheat flour skin, which is fried in hot oil", 580),
        Food("Fish (Grilled)" , "Fried fish refers to any fish or shellfish that has been prepared by frying. Often, the fish is covered in batter, egg and breadcrumbs, flour, or herbs and spices before being fried and served, often with a slice of lemon. Fish is fried in many parts of the world, and fried fish is an important food in many cuisines.", 145),
        Food("French Toast" , "French toast is a dish made of sliced bread soaked in eggs and milk, then fried. Alternative names and variants include eggy bread, Bombay toast, German toast, gypsy toast, poor knights, torrija and Arme Riddere.", 149),
        Food("Guancamole" , "Guacamole is an avocado-based dip, spread, or salad first developed by the Aztecs in present-day Mexico. In addition to its use in modern Mexican cuisine, it has become part of international and American cuisine as a dip, condiment and salad ingredient.", 90),
        Food("Ham" , "Ham is pork from a leg cut that has been preserved by wet or dry curing, with or without smoking. As a processed meat, the term \"ham\" includes both whole cuts of meat and ones that have been mechanically formed", 46),
        Food("Hamburger" , "A hamburger is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, or flame broiled.", 117),
        Food("Hot Dogs" , "The hot dog or dog is a grilled or steamed link-sausage sandwich where the sausage is served in the slit of a partially sliced bun. It can also refer to the sausage itself. The sausage used is the wiener or frankfurter. The names of these sausages also commonly refer to their assembled sandwiches.", 165),
        Food("Ice Cream" , "Ice cream is a sweetened frozen food typically eaten as a snack or dessert. It may be made from dairy milk or cream and is flavored with a sweetener, either sugar or an alternative, and any spice, such as cocoa or vanilla. Colourings are usually added, in addition to stabilizers", 273),
        Food("Jerky" , "Jerky is lean trimmed meat that has been cut into strips and dried (dehydrated) to prevent spoilage. Normally, this drying includes the addition of salt to prevent bacteria growth before the meat has finished the dehydrating process.", 82),
        Food("Lasagne" , "Lasagne are a type of wide, flat pasta, possibly one of the oldest types of pasta. Lasagne, or the singular lasagna, commonly refers to a culinary dish made with stacked layers of pasta alternated with sauces and ingredients such as meats, vegetables and cheese, and sometimes topped with melted grated cheese.", 747),
        Food("Laksa" , "DescriptionLaksa is a spicy noodle soup popular in the Peranakan cuisine of Southeast Asia. Laksa consists of thick wheat noodles or rice vermicelli with chicken, prawn or fish, served in spicy soup based on either rich and spicy curry coconut milk or on sour asam.", 694),
        Food("Meatballs" , "A meatball is ground meat rolled into a small ball, sometimes along with other ingredients, such as bread crumbs, minced onion, eggs, butter, and seasoning. Meatballs are cooked by frying, baking, steaming, or braising in sauce. There are many types of meatballs using different types of meats and spices.", 40),
        Food("Milk" , "Milk is a nutrient-rich, white liquid food produced by the mammary glands of mammals. It is the primary source of nutrition for infant mammals before they are able to digest other types of food.", 122),
        Food("Milkshake" , "A milkshake is a sweet, cold beverage that is usually made from milk, ice cream, and/or ice milk, and sometimes flavorings or sweeteners such as butterscotch, caramel sauce, chocolate syrup, or fruit syrup. Many more precise and rigid definitions are used, depending on the location.", 634),
        Food("Milo" , "Milo is a chocolate and malt powder typically mixed with hot water and milk to produce a beverage popular in Oceania, South America, Southeast Asia and parts of Africa. Produced by Nestlé, Milo was originally developed by Australian inventor Thomas Mayne in 1934.", 414),
        Food("Murtabak" , "Murtabak is a stuffed pancake or pan-fried bread which was commonly found in the Arabian Peninsula and Southeast Asia, notably in Saudi Arabia, Yemen, Israel, Indonesia, Malaysia, Singapore, Brunei,", 674),
        Food("Nasi Lemak" , "Nasi lemak is a Malay fragrant rice dish cooked in coconut milk and pandan leaf. It is commonly found in Malaysia, where it is considered the national dish; it is also the native dish in neighbouring areas with significant Malay populations such as Singapore; Brunei, and Southern Thailand", 644),
        Food("Nasi Kandar" , "Nasi kandar is a popular northern Malaysian dish, which originates from Penang. It was popularized by Indian Muslim traders from India. It is a meal of steamed rice which can be plain or mildly flavored, and served with a variety of curries and side dishes.", 992),
        Food("Noodles" , "Noodles are a type of food made from unleavened dough which is rolled flat and cut, or extruded, into long strips or strings. Noodles can be refrigerated for short-term storage or dried and stored for future use. Noodles are usually cooked in boiling water, sometimes with cooking oil or salt added.", 221),
        Food("Peanuts" , "The peanut, also known as the groundnut, goober, or monkey nut, and taxonomically classified as Arachis hypogaea, is a legume crop grown mainly for its edible seeds. It is widely grown in the tropics and subtropics, being important to both small and large commercial producers. ", 166),
        Food("Pizza" , "Pizza is a savory dish of Italian origin, consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients baked at a high temperature, traditionally in a wood-fired oven. A small pizza is sometimes called a pizzetta. ", 272),
        Food("Pancakes" , "A pancake is a flat cake, often thin and round, prepared from a starch-based batter that may contain eggs, milk and butter and cooked on a hot surface such as a griddle or frying pan, often frying with oil or butter", 74),
        Food("Roti Canai" , "Roti canai, also known as roti cane or roti parotta, is an Indian-influenced flatbread dish found in several countries in Southeast Asia, including Malaysia, Brunei, Indonesia and Singapore", 360),
        Food("Spaghetti" , "Spaghetti is a long, thin, solid, cylindrical pasta. Spaghettoni is a thicker form of spaghetti, while capellini is a very thin spaghetti. It is a staple food of traditional Italian cuisine. Like other pasta, spaghetti is made of milled wheat and water and sometimes enriched with vitamins and minerals.", 173),
        Food("Toast" , "Toast is a form of bread that has been browned by exposure to radiant heat. This browning is the result of a Maillard reaction, altering the flavor of the bread and making it firmer so that it is easier to spread toppings on it. Toasting is a common method of making stale bread more palatable.", 23),
        Food("Waffles" , "A waffle is a dish made from leavened batter or dough that is cooked between two plates that are patterned to give a characteristic size, shape, and surface impression. There are many variations based on the type of waffle iron and recipe used.", 218),
        Food("Wine" , "Wine is an alcoholic drink made from fermented grapes. Yeast consumes the sugar in the grapes and converts it to ethanol, carbon dioxide, and heat. Different varieties of grapes and strains of yeasts produce different styles of wine", 150),
        Food("Yoghurt" , "Yogurt, also spelled yoghurt, yogourt or yoghourt, is a food produced by bacterial fermentation of milk. The bacteria used to make yogurt are known as yogurt cultures. ", 35)















    )




}