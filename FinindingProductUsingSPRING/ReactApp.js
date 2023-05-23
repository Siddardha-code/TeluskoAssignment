import React, { useEffect, useState } from 'react';

function App() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetchProducts();
  }, []);

  const fetchProducts = async () => {
    const response = await fetch('/api/products');
    const data = await response.json();
    setProducts(data);
  };

  return (
    <div>
      <h1>Product List</h1>
      {products.map((product) => (
        <div key={product.id}>
          <h2>{product.name}</h2>
          <p>Type: {product.type}</p>
          <p>Place: {product.place}</p>
          <p>Warranty: {product.warranty}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
