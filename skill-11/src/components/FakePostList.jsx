import { useEffect, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

function FakePostList() {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");
  const [selectedUser, setSelectedUser] = useState("all");

  const fetchPosts = async () => {
    try {
      setLoading(true);
      const response = await axios.get("https://dummyjson.com/posts");
      setPosts(response.data.posts);
      setError("");
    } catch (err) {
      setError("Failed to fetch fake API posts");
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchPosts();
  }, []);

  const filteredPosts =
    selectedUser === "all"
      ? posts
      : posts.filter((post) => post.userId === Number(selectedUser));

  return (
    <div className="container">
      <h2>Fake API Posts</h2>

      <div className="top-bar">
        <Link to="/" className="btn">Back</Link>
        <button className="btn" onClick={fetchPosts}>Refresh</button>
      </div>

      <div className="filter-box">
        <label>Filter by User ID: </label>
        <select
          value={selectedUser}
          onChange={(e) => setSelectedUser(e.target.value)}
        >
          <option value="all">All</option>
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
          <option value="4">4</option>
          <option value="5">5</option>
        </select>
      </div>

      {loading && <p>Loading posts...</p>}
      {error && <p className="error">{error}</p>}

      <div className="card-container">
        {filteredPosts.map((post) => (
          <div className="card" key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <p><strong>User ID:</strong> {post.userId}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default FakePostList;