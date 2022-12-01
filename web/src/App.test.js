import { render, screen } from '@testing-library/react';
import App from './App';

test('should render home page ', () => {
  render(<App />);
  const el = screen.getByText(/We have/i);
  expect(el).toBeInTheDocument();
});
