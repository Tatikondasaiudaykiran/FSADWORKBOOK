import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

function LocalUserList() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    fetch("/users.json")
      .then((response) => {
        if (!response.ok) {
          throw new Error("Failed to fetch local users");
        }
        return response.json();
      })
      .then((data) => {
        setUsers(data);
        setLoading(false);
      })
      .catch((err) => {
        setError(err.message);
        setLoading(false);
      });
  }, []);

  return (
    <div className="container">
      <h2>Local Users</h2>
      <Link to="/" className="btn">Back</Link>

      {loading && <p>Loading local users...</p>}
      {error && <p className="error">{error}</p>}

      <div className="card-container">
        {users.map((user) => (
          <div className="card" key={user.id}>
            <h3>{user.name}</h3>
            <p><strong>Email:</strong> {user.email}</p>
            <p><strong>Phone:</strong> {user.phone}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default LocalUserList;